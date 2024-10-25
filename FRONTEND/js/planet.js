document.querySelectorAll('.albero').forEach(function(element) {
    element.addEventListener('mouseover', function() {
        const alberoId = this.getAttribute('data-albero-id');
        mostraDettagliAlbero(alberoId);
    });
});

function mostraDettagliAlbero(alberoId) {
    // Cambia il contenuto dei dettagli a destra in base all'ID dell'albero
    const titolo = document.getElementById('albero-titolo');
    const descrizione = document.getElementById('albero-descrizione');

    if (alberoId === '1') {
        titolo.textContent = "Albero 1: Quercia";
        descrizione.textContent = "Questo albero è stato piantato in Italia e ha 10 anni.";
    } else if (alberoId === '2') {
        titolo.textContent = "Albero 2: Pino";
        descrizione.textContent = "Questo albero si trova in Canada ed è alto 15 metri.";
    } else if (alberoId === '3') {
        titolo.textContent = "Albero 3: Baobab";
        descrizione.textContent = "Questo albero si trova in Africa ed è noto per la sua grande longevità.";
    }
}
