console.log("Hola.");

const buscar = () => {

    let arrValue = [];
    let parametro = document.getElementById("input-id").value;
    let url = "http://localhost:8080/peliculas/" + parametro;

    fetch(url, {method: "GET"})
        .then((response) => {
            if (!response.ok) {
                throw new Error(`Error ${response.status}: No se encontró la película`);
            }
            return response.json();
        })
        .then((myJson) => {

            console.log(myJson);
            let element = document.getElementById("table");
            element.style.display = "block";

            arrValue.push(myJson.idPelicula);
            arrValue.push(myJson.titulo);
            arrValue.push(myJson.director);

            for (let index in arrValue) {
                document.getElementById("parameterValue" + index).innerHTML =
                    arrValue[index];
            }
        })
        .catch((err) => {
            console.log(err);

            let element = document.getElementById("table");
            element.style.display = "none";

            alert("No se pudo obtener la información de la película.");
        });
};