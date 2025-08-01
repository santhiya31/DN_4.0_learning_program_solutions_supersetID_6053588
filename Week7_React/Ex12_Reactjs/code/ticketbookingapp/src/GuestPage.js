import React from 'react';

const flights = [
  { id: 1, from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
  { id: 2, from: 'Chennai', to: 'Bangalore', time: '2:30 PM' },
  { id: 3, from: 'Hyderabad', to: 'Kolkata', time: '6:00 PM' },
];

const GuestPage = () => (
  <div>
    <h2>Welcome Guest! </h2>
    <p>Login to book your tickets.</p>
    <h3>Available Flights:</h3>
    <ul>
      {flights.map(flight => (
        <li key={flight.id}>
          {flight.from} ➡️ {flight.to} at {flight.time}
        </li>
      ))}
    </ul>
  </div>
);

export default GuestPage;
