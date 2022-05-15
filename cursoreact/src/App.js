import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {

  const [linea1, setLinea1] = useState("");
  const [linea2, setLinea2] = useState("");

  const onChangeLinea1 = function(valor) {
    alert(valor)
  }

  return (
    <div className="App">
      <br />

    <select>
      <option value="tenemos">Bugs Bunny</option>
      <option value="hombre">Hombre</option>
    </select>
    <br />

    <input onChange={onChangeLinea1} type="text" placeholder="Linea 1"/>  <br />
    <input type="text" placeholder="Linea 2"/>  <br />
    <button>Exportar</button>

    <div>
      <span>{linea1}</span> <br />
      <span>{linea2}</span>
      <img src=""/>
      <img src=""/>
    </div>

    </div>
  );
}

export default App;
