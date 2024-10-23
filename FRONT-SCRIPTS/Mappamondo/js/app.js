let scene, camera, renderer, globe, continents = [], points = [];
let isMouseOver = false; // Variabile per controllare il passaggio del mouse

function init() {
  // Crea la scena
  scene = new THREE.Scene();

  // Crea la camera
  camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
  camera.position.z = 5;

  // Crea il renderer
  renderer = new THREE.WebGLRenderer({ antialias: true });
  renderer.setSize(window.innerWidth, window.innerHeight);
  document.body.appendChild(renderer.domElement);

  // Crea il globo
  const geometry = new THREE.SphereGeometry(1, 32, 32);
  const texture = new THREE.TextureLoader().load('img/globe.png'); // Inserisci il percorso della tua immagine del mondo
  const material = new THREE.MeshBasicMaterial({ map: texture });
  globe = new THREE.Mesh(geometry, material);
  scene.add(globe);

  // Aggiungi continenti cliccabili e pallini che ruotano con il globo
  createContinent(0.5, 0.5, 0.1); // Esempio di continenti
  createClickablePoint(20, 0);    // Pallino per Europa
  createClickablePoint(-40, -70); // Pallino per Sud America

  // Aggiungi eventi di ascolto per mouseover e mouseout
  document.addEventListener('mousemove', onMouseMove, false);

  // Gestione della rotazione e interazione
  animate();
  document.addEventListener('mousedown', onDocumentMouseDown, false);
}

function createContinent(lat, lon, size) {
  const geometry = new THREE.SphereGeometry(size, 32, 32);
  const material = new THREE.MeshBasicMaterial({ color: 0x00ff00, transparent: true, opacity: 0.5 });
  const continent = new THREE.Mesh(geometry, material);

  // Posiziona i continenti secondo latitudine e longitudine
  const phi = (90 - lat) * (Math.PI / 180);
  const theta = (lon + 180) * (Math.PI / 180);

  continent.position.x = 1 * Math.sin(phi) * Math.cos(theta);
  continent.position.y = 1 * Math.cos(phi);
  continent.position.z = 1 * Math.sin(phi) * Math.sin(theta);

  continents.push(continent);
  globe.add(continent); // Aggiungi il continente come figlio del globo
}

function createClickablePoint(lat, lon) {
  const geometry = new THREE.SphereGeometry(0.05, 32, 32); // Pallino piccolo
  const material = new THREE.MeshBasicMaterial({ color: 0xff0000 }); // Rosso per il pallino
  const point = new THREE.Mesh(geometry, material);

  // Posiziona i pallini in base alla latitudine e longitudine
  const phi = (90 - lat) * (Math.PI / 180);
  const theta = (lon + 180) * (Math.PI / 180);

  point.position.x = 1.05 * Math.sin(phi) * Math.cos(theta); // 1.05 per farlo uscire dalla superficie del globo
  point.position.y = 1.05 * Math.cos(phi);
  point.position.z = 1.05 * Math.sin(phi) * Math.sin(theta);

  points.push(point);
  globe.add(point); // Aggiungi il pallino come figlio del globo
}

function onDocumentMouseDown(event) {
  event.preventDefault();
  const mouse = new THREE.Vector2(
    (event.clientX / window.innerWidth) * 2 - 1,
    -(event.clientY / window.innerHeight) * 2 + 1
  );

  const raycaster = new THREE.Raycaster();
  raycaster.setFromCamera(mouse, camera);

  // Verifica se i pallini sono stati cliccati
  const intersects = raycaster.intersectObjects(points);
  if (intersects.length > 0) {
    alert('Hai cliccato su un pallino del continente!');
  }
}

function onMouseMove(event) {
  const mouse = new THREE.Vector2(
    (event.clientX / window.innerWidth) * 2 - 1,
    -(event.clientY / window.innerHeight) * 2 + 1
  );

  const raycaster = new THREE.Raycaster();
  raycaster.setFromCamera(mouse, camera);

  // Verifica se il mouse è sopra il globo
  const intersects = raycaster.intersectObject(globe);
  if (intersects.length > 0) {
    isMouseOver = true;
  } else {
    isMouseOver = false;
  }
}

function animate() {
  requestAnimationFrame(animate);

  // Ruota il globo lentamente solo se il mouse non è sopra
  if (!isMouseOver) {
    globe.rotation.y += 0.005; // Velocità ridotta
  }

  renderer.render(scene, camera);
}

// Ridimensionamento della finestra
window.addEventListener('resize', () => {
  renderer.setSize(window.innerWidth, window.innerHeight);
  camera.aspect = window.innerWidth / window.innerHeight;
  camera.updateProjectionMatrix();
});

init();
