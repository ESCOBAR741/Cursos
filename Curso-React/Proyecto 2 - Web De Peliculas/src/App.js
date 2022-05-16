import logo from './logo.svg';
import './App.css';
import Pelicula from './Pelicula';
import PageWraper from './PageWraper';
import peliculasJson from './peliculas.json';


function App() {

  let peliculas = peliculasJson;

  var arreglo = peliculas.map(pelicula => { // .map Recorre cada una de las peliculas y a la vez devuelve alguna cosa
    return "index";
  })

  return (
    <PageWraper>

        {peliculas.map(pelicula =>  //Si ponemos llaves obligatoriamente debemos poner return y la etiqueta al lado "<Pelicula>"
         <Pelicula titulo={pelicula.titulo} calificacion={pelicula.calificacion} director={pelicula.calificacion} actores={pelicula.actores} 
        fecha={pelicula.fecha} duracion={pelicula.duracion} img={pelicula.img} >
        {pelicula.descripcion}</Pelicula>
            
          )}

    </PageWraper>
  );
}

export default App;
