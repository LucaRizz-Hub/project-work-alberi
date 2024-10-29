document.querySelectorAll('.albero').forEach(function(element) {
    element.addEventListener('mouseover', function() {
        const alberoId = this.getAttribute('data-albero-id');
        mostraDettagliAlbero(alberoId);
    });
});

function mostraDettagliAlbero(alberoId) {
    // Seleziona gli elementi della card
    const nomeAlbero = document.getElementById('nomeAlbero');
    const paese = document.getElementById('paese');
    const significato = document.getElementById('significato');
    const prezzo = document.getElementById('prezzo');
    const foto = document.getElementById('foto');
    const adoptButton = document.getElementById('adopt-button');

    // Aggiorna le informazioni della card in base all'albero selezionato
    if (alberoId === '1') {
        nomeAlbero.textContent = "Quercia - Quercius Quercinus";
        paese.textContent = "Paese: Italia";
        significato.textContent = "Significato: Simbolo di forza e resistenza.";
        prezzo.textContent = "€20,00 /anno";
        foto.src = "../images/albero_1.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '2') {
        nomeAlbero.textContent = "Pino";
        paese.textContent = "Paese: Canada";
        significato.textContent = "Significato: Simbolo di longevità e resilienza.";
        prezzo.textContent = "€25,00 /anno";
        foto.src = "path/to/pino.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '3') {
        nomeAlbero.textContent = "Baobab";
        specieAlbero.textContent = "Specie: Baobab";
        paese.textContent = "Paese: Africa";
        significato.textContent = "Significato: Simbolo di saggezza e adattabilità.";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "path/to/baobab.jpg"; // Sostituisci con il percorso dell'immagine
    }

    // Mostra il tasto "Adottami" e imposta l'href con l'ID dell'albero
    adoptButton.style.display = 'flex';
    adoptButton.href = `/adozione?id=${alberoId}`;
}
