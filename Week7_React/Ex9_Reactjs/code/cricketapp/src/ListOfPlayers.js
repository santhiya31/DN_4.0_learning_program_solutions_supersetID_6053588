import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 45 },
    { name: 'Gill', score: 72 },
    { name: 'Dhoni', score: 95 },
    { name: 'Hardik', score: 60 },
    { name: 'Pant', score: 30 },
    { name: 'Jadeja', score: 90 },
    { name: 'Ashwin', score: 25 },
    { name: 'Shami', score: 77 },
    { name: 'Bumrah', score: 82 },
    { name: 'Siraj', score: 50 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
