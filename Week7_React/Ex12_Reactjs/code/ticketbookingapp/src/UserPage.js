import React from 'react';

const flights = [
  { id: 1, from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
  { id: 2, from: 'Chennai', to: 'Bangalore', time: '2:30 PM' },
  { id: 3, from: 'Hyderabad', to: 'Kolkata', time: '6:00 PM' },
];

const UserPage = () => {
  const handleBooking = (flight) => {
    alert(`Ticket booked for flight from ${flight.from} to ${flight.to} at ${flight.time}`);
  };

  return (
    <div>
      <h2>Welcome User </h2>
      <h3>Book Your Tickets:</h3>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.from} ➡️ {flight.to} at {flight.time}{' '}
            <button onClick={() => handleBooking(flight)}>Book</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserPage;
