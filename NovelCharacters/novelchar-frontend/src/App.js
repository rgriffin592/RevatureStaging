import './App.css';
import MainPage from './Components/MainPage/MainPage';
import NavBar from './Components/NavBar/NavBar';
import CharactersPage from './Components/CharactersPage/CharactersPage';
import NewCharacter from './Components/NewCharacter/NewCharacter';
import NewNovel from './Components/NewNovel/NewNovel';

function App() {
  return (
    <div>
      <NavBar />
      <MainPage />
      {/*<CharactersPage /> */}
      {/*<NewCharacter /> */}
      {/*<NewNovel /> */}
    </div>
  );
}

export default App;
