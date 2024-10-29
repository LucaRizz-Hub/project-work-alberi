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
        nomeAlbero.textContent = "Baobab - Adansonia Digitata";
        paese.textContent = "Paese: Africa, Madagascar";
        significato.textContent = "Significato: Longevità e Saggezza";
        prezzo.textContent = "€25,00 /anno";
        foto.src = "../images/albero_1.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '2') {
        nomeAlbero.textContent = "Acacia - Acacia Tortilis";
        paese.textContent = "Paese: Africa, Sud Africa";
        significato.textContent = "Significato: Protezione e Resistenza";
        prezzo.textContent = "€20,00 /anno";
        foto.src = "../images/albero_2.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '3') {
        nomeAlbero.textContent = "Mopane - Colophospermum Mopane";
        paese.textContent = "Paese: Africa, Zimbabwe";
        significato.textContent = "Significato: Adattabilità e Persistenza";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_3.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '4') {
        nomeAlbero.textContent = "Ebano Africano - Diospyros Maspiliformis";
        paese.textContent = "Paese: Africa, Camerun";
        significato.textContent = "Significato: Adattabilità e Persistenza";
        prezzo.textContent = "€45,00 /anno";
        foto.src = "../images/albero_4.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '5') {
        nomeAlbero.textContent = "Fico del Capo - Ficus Capensis";
        paese.textContent = "Paese: Africa, Sud Africa";
        significato.textContent = "Significato: Fertilità e Abbondanza";
        prezzo.textContent = "€45,00 /anno";
        foto.src = "../images/albero_5.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '6') {
        nomeAlbero.textContent = "Teak - Tectona Grandis";
        paese.textContent = "Paese: Asia, India";
        significato.textContent = "Significato: Resistenza e Nobiltà";
        prezzo.textContent = "€40,00 /anno";
        foto.src = "../images/albero_6.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '7') {
        nomeAlbero.textContent = "Bambù Gigante - Dendrocalamus Giganteus";
        paese.textContent = "Paese: Asia, Cina";
        significato.textContent = "Significato: Crescita Rapida e Versaltilità";
        prezzo.textContent = "€15,00 /anno";
        foto.src = "../images/albero_7.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '8') {
        nomeAlbero.textContent = "Albero di Sandalo - Santalum Album";
        paese.textContent = "Paese: Asia, India";
        significato.textContent = "Significato: Spiritualità e Pace";
        prezzo.textContent = "€60,00 /anno";
        foto.src = "../images/albero_8.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '9') {
        nomeAlbero.textContent = "Ginkgo Biloba - Ginkgo Biloba";
        paese.textContent = "Paese: Asia, Cina";
        significato.textContent = "Significato: Immortalità e Rinascita";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_9.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '10') {
        nomeAlbero.textContent = "Cedro del Libano";
        paese.textContent = "Paese: Asia, Libano";
        significato.textContent = "Significato: Forza e Maestosità";
        prezzo.textContent = "€50,00 /anno";
        foto.src = "../images/albero_10.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '11') {
        nomeAlbero.textContent = "Quercia - Quercus Robur";
        paese.textContent = "Paese: Europa, Spagna";
        significato.textContent = "Significato: Forza e Stabilità";
        prezzo.textContent = "€55,00 /anno";
        foto.src = "../images/albero_11.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '12') {
        nomeAlbero.textContent = "Faggio - Fagus Sylvatica";
        paese.textContent = "Paese: Europa, Germania";
        significato.textContent = "Significato: Resilienza e Protezione";
        prezzo.textContent = "€45,00 /anno";
        foto.src = "../images/albero_12.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '13') {
        nomeAlbero.textContent = "Pino Silvestre - Pinus Sylvestris ";
        paese.textContent = "Paese: Europa, Finlandia";
        significato.textContent = "Significato: Resistenza e Purezza";
        prezzo.textContent = "€40,00 /anno";
        foto.src = "../images/albero_13.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '14') {
        nomeAlbero.textContent = " Ulivo - Olea Europaea ";
        paese.textContent = "Paese: Europa, Italia";
        significato.textContent = "Significato: Pace e Prosperità";
        prezzo.textContent = "€50,00 /anno";
        foto.src = "../images/albero_14.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '15') {
        nomeAlbero.textContent = " Castagno Europeo - Castanea Sativa ";
        paese.textContent = "Paese: Europa, Italia";
        significato.textContent = "Significato: Generosità e Abbondanza";
        prezzo.textContent = "€50,00 /anno";
        foto.src = "../images/albero_15.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '16') {
        nomeAlbero.textContent = "Sequoia Gigante - Sequoiadendron Giganteum";
        paese.textContent = "Paese: America, USA";
        significato.textContent = "Significato: Eternità e Grandezza";
        prezzo.textContent = "€150,00 /anno";
        foto.src = "../images/albero_16.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '17') {
        nomeAlbero.textContent = "Pino Ponderosa - Pinus Ponderosa";
        paese.textContent = "Paese: America, USA";
        significato.textContent = "Significato: Sopravvivenza e Adattamento";
        prezzo.textContent = "€45,00 /anno";
        foto.src = "../images/albero_17.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '18') {
        nomeAlbero.textContent = "Cipresso Calvo - Taxodium Distichum";
        paese.textContent = "Paese: America, USA";
        significato.textContent = "Significato: Rigenerazione e Resilienza";
        prezzo.textContent = "€35,00 /anno";
        foto.src = "../images/albero_18.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '19') {
        nomeAlbero.textContent = "Jacaranda - Jacaranda Mimosifolia";
        paese.textContent = "Paese: America, Argentina";
        significato.textContent = "Significato: Creatività e Bellezza";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_19.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '20') {
        nomeAlbero.textContent = "Palo Santo - Bursera Graveolens";
        paese.textContent = "Paese: America, Ecuador";
        significato.textContent = "Significato: Purificazione e Guarigione";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_20.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '21') {
        nomeAlbero.textContent = "Eucalipto - Eucalyptus Globulus";
        paese.textContent = "Paese: Oceania, Australia";
        significato.textContent = "Significato: Guarigione e Protezione";
        prezzo.textContent = "€25,00 /anno";
        foto.src = "../images/albero_21.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '22') {
        nomeAlbero.textContent = "Pohutukawa - Metrosideros Excelsa";
        paese.textContent = "Paese: Oceania, Nuova Zelanda";
        significato.textContent = "Significato: Festa e Vitalità";
        prezzo.textContent = "€40,00 /anno";
        foto.src = "../images/albero_22.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '23') {
        nomeAlbero.textContent = "Kauri - Agathis Australis";
        paese.textContent = "Paese: Oceania, Nuova Zelanda";
        significato.textContent = "Significato: Stabilità e Antichità";
        prezzo.textContent = "€60,00 /anno";
        foto.src = "../images/albero_23.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '24') {
        nomeAlbero.textContent = "Acacia - Acacia Pycnantha";
        paese.textContent = "Paese: Oceania, Australia";
        significato.textContent = "Significato: Ottimismo e Prosperità";
        prezzo.textContent = "€20,00 /anno";
        foto.src = "../images/albero_24.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '25') {
        nomeAlbero.textContent = "Casuarina - Casuarina Equisetifolia";
        paese.textContent = "Paese: Oceania, Australia";
        significato.textContent = "Significato: Protezione e Resilienza";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_25.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '26') {
        nomeAlbero.textContent = "Albero del Tè - Melaleuca Alternifolia";
        paese.textContent = "Paese: Oceania, Australia";
        significato.textContent = "Significato: Purificazione e Guarigione";
        prezzo.textContent = "€20,00 /anno";
        foto.src = "../images/albero_26.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '27') {
        nomeAlbero.textContent = "Lapacho - Tabebuia Impetiginosa";
        paese.textContent = "Paese: America, Brasile";
        significato.textContent = "Significato: Guarigione e Forza";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_27.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '28') {
        nomeAlbero.textContent = "Betulla - Betula Pendula";
        paese.textContent = "Paese: Europa, Finlandia";
        significato.textContent = "Significato: Purezza e Rinnovamento";
        prezzo.textContent = "€25,00 /anno";
        foto.src = "../images/albero_28.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '29') {
        nomeAlbero.textContent = "Nespolo Giapponese - Eriobotrya Japonica";
        paese.textContent = "Paese: Asia, Giappone";
        significato.textContent = "Significato: Dolcezza e Vitalità";
        prezzo.textContent = "€35,00 /anno";
        foto.src = "../images/albero_29.jpg"; // Sostituisci con il percorso dell'immagine
    } else if (alberoId === '30') {
        nomeAlbero.textContent = "Marula - Sclerocarya";
        paese.textContent = "Paese: Africa, Sud Africa";
        significato.textContent = "Significato: Abbondanza e Nutrimento";
        prezzo.textContent = "€30,00 /anno";
        foto.src = "../images/albero_30.jpg"; // Sostituisci con il percorso dell'immagine
    }

    // Mostra il tasto "Adottami" e imposta l'href con l'ID dell'albero
    adoptButton.style.display = 'flex';
    adoptButton.href = `/adozione?id=${alberoId}`;
}
