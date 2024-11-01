document.addEventListener('mousemove', (event) => {
    const mouseX = event.clientX;
    const mouseY = event.clientY;
    const windowWidth = window.innerWidth;
    const windowHeight = window.innerHeight;

    // Calcola le percentuali del movimento orizzontale e verticale
    const percentageX = (mouseX / windowWidth) - 0.5;
    const percentageY = (mouseY / windowHeight) - 0.5;

    // Muovi i livelli in base alla profondità sia in orizzontale che verticale
    document.querySelector('.layer1').style.transform = `translate(${percentageX * 90}px, ${percentageY * 45}px)`;
    document.querySelector('.layer2').style.transform = `translate(${percentageX * 70}px, ${percentageY * 35}px)`;
    document.querySelector('.layer3').style.transform = `translate(${percentageX * 50}px, ${percentageY * 25}px)`;
    document.querySelector('.layer4').style.transform = `translate(${percentageX * 30}px, ${percentageY * 15}px)`;
});
