import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const increment = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    console.log("Hello! Let's increment the counter.");
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    console.log('Synthetic Event:', e);
    alert('I was clicked');
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Event Examples App</h1>

      <h2>Counter: {count}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement}>Decrement</button>

      <hr />

      <button onClick={() => sayWelcome('Welcome to React Events!')}>Say Welcome</button>

      <hr />

      <button onClick={handleClick}>OnPress</button>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
