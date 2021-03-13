import catbellImg from '../resources/image/catbellImg.png'
import {Input} from "antd";
import { SearchOutlined } from '@ant-design/icons';

function Header() {
    return (
        <div style={{borderBottom:'1px solid', borderColor:'#e5e5e5'}}>
            <div style={{height: 45, borderBottom:'1px solid', borderColor:'#e5e5e5'}}>
                <div className={'realtimeTitle'}>4차 산업혁명, 초연결성(Hyper-Connectivity), 지능정보화 등으로 다양하게 표현되는 최근 디지털 전환(Digital Transformation)의 추세</div>
                <div className={'memberState'}><div style={{float:'right'}}>내정보</div><div style={{float:'right', marginRight: 30}}>로그아웃</div></div>
            </div>
            <div style={{height: 100}}>
                <div style={{width:380}}><img src={catbellImg} width={140} height={85}style={{float:'left', padding:5}}/> <div className={'headerFont'}>피드</div><div className={'headerFont'} style={{marginLeft:-20}}>전문검색</div></div>
                <Input placeholder="통합 검색" prefix={<SearchOutlined />} style={{width:'calc(100% - 380px - 400px)', float:'right', height: 35, marginTop: 35, marginRight:20, borderRadius:7}}/>
            </div>
        </div>
    );
}

export default Header;
