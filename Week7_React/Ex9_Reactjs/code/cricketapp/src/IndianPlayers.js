import React from 'react';

const IndianPlayers = () => {
  const team = ['Virat', 'Rohit', 'Gill', 'Pant', 'Jadeja', 'Ashwin', 'Shami', 'Bumrah'];

  const oddTeam = team.filter((_, index) => index % 2 !== 0);
  const evenTeam = team.filter((_, index) => index % 2 === 0);

  const [player1, player2, ...restPlayers] = team;

  const T20players = ['Rinku', 'Sanju', 'Surya'];
  const RanjiTrophyPlayers = ['Rahane', 'Pujara'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, i) => <li key={i}>{player}</li>)}
      </ul>

      <h4>Destructured Players</h4>
      <p>First: {player1}, Second: {player2}</p>
    </div>
  );
};

export default IndianPlayers;
