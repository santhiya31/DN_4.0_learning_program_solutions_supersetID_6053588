import React from 'react';
import CalculateScore from './components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore name="Santhiya" school="ABC School" total={450} goal={5} />
    </div>
  );
}

export default App;
