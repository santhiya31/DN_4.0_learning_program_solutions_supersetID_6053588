import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [selected, setSelected] = useState('book');
  const showCourse = true; 

  const renderComponentIfElse = () => {
    if (selected === 'book') return <BookDetails />;
    else if (selected === 'blog') return <BlogDetails />;
    else return <CourseDetails />;
  };


  const renderComponentTernary = selected === 'book' ? <BookDetails /> : <BlogDetails />;

  const renderCourse = showCourse && <CourseDetails />;

  return (
    <div style={{ padding: '20px' }}>
      <h1> Blogger App</h1>

      <div>
        <button onClick={() => setSelected('book')}>Show Book</button>
        <button onClick={() => setSelected('blog')}>Show Blog</button>
        <button onClick={() => setSelected('course')}>Show Course</button>
      </div>

      <hr />
      
      {renderComponentIfElse()}

      <hr />
     
      {renderComponentTernary}

      <hr />
      
      {renderCourse}
    </div>
  );
}

export default App;
