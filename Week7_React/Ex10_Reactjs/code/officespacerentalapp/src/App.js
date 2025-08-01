import React from 'react';
import './App.css';

function App() {
  const heading = <h1>Office Space Rental App</h1>;

  const offices = [
    {
      name: 'Prime Office Hub',
      rent: 55000,
      address: '123 MG Road, Bangalore',
      image: 'https://thumbs.dreamstime.com/b/office-building-exterior-modern-small-43610327.jpg',
    },
    {
      name: 'Skyline Workspace',
      rent: 75000,
      address: '45 Residency Rd, Mumbai',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3qS6HtETUgJhlFom891BBo5EFV1o5zaChJA&s',
    },
    {
      name: 'Downtown Tower',
      rent: 62000,
      address: '88 Mount Road, Chennai',
      image: 'https://images.stockcake.com/public/c/1/1/c11628f7-ef7e-455b-9ddf-0a4647ae3df3_large/green-covered-office-building-stockcake.jpg',
    },
    {
      name: 'Budget BizSpace',
      rent: 40000,
      address: '12 Ring Road, Delhi',
      image: 'https://i.pinimg.com/564x/3d/0b/60/3d0b6006e644c1e6efc336bf7c64c2ce.jpg',
    },
  ];

  return (
    <div className="App">
      {heading}
      <div className="office-list">
        {offices.map((office, index) => (
          <div key={index} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
