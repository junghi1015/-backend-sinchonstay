import IndexPage from "./pages";
import Header from "./component/Header";
import './resources/css/index.css';
import 'antd/dist/antd.css';


function App() {
  return (
   <div style={{width: 1080, margin: '0px auto'}}>
       <Header/>
     <IndexPage/>

   </div>
  );
}

export default App;
