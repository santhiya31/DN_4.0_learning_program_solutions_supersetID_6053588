import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; 
    const result = parseFloat(rupees) * conversionRate;
    setEuro(result.toFixed(2));
  };

  return (
    <div>
      <h2> Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in ₹"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>€ Euro: {euro}</p>}
    </div>
  );
};

export default CurrencyConvertor;
