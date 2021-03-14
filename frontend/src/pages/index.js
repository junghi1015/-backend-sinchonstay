import React, {useEffect, useState} from 'react';
import {Button, Card, Checkbox, Form, Input, Modal} from 'antd';
import {LockOutlined, SearchOutlined, UserOutlined} from '@ant-design/icons';
import {bsApi} from "../utills/rawApi";
import '../resources/css/index.css';
import catbellImg from "../resources/image/catbellImg.png";
import { Radio } from 'antd';

function IndexPage() {
    const [rawCentents, setRawCentents] = useState([]);
    const [count, setCount] = useState(0);
    const [keyword, setKeyword] = useState('');
    const [loginState, setLoginState] = useState(true);
    const [works, setWords] = useState('');


    useEffect(() => {
        getRawContents()
        getRawCount()
    }, [])



    const checkId = (e) => {
    console.log(e.target.value,'22;;;ss')
        setWords(e.target.value)
    }

    // rawListCount
    const getRawContents = async () => {

        const resultData = await bsApi.get('/rawList');
        setRawCentents(resultData.data)
    }

    const getRawCount = async () => {

        const resultData = await bsApi.get('/rawListCount');
        setCount(resultData.data)
    }

    const logout = () => {
        setLoginState(false)
    }

    const onSearch = async (param) => {

        let parameter = {
            params: {
                keyword: param,
                works : works
            }
        }
        console.log(parameter, '?????')
        if (param === '') {
            getRawContents()
        } else {
            const resultData = await bsApi.get('/rawListSearch', parameter);
            setRawCentents(resultData.data)
        }
    }

    /**
     * @description 엔터키 입력시 검색 기능 작동
     */
    const handleKeyPress = e => {
        console.log(e.key);
        if (e.key === 'Enter') {
            onSearch(keyword)
        }
    };


    /**
     * @검색버튼 클릭시 요청 이벤트 작동
     */
    const searchKeyword = () => {
        onSearch(keyword)
    }

    const scriptWord = (e) => {
        setKeyword(e.target.value)
    }


    //로그인
    const onFinish = async (values) => {
        let parameter = {
            params: {
                username: values.username,
                password: values.password
            }
        }
        const resultData = await bsApi.get('/login', parameter);
        if(resultData.data == false){
            alert('로그인 정보가 잘못 되었습니다.')
        }else{
            setLoginState(resultData.data)
        }

    };

    const useStyle = {
        borderRadius: 17,
        margin: 3,
        border: 0,
        padding: 3,
        paddingLeft: 13,
        paddingRight: 10,
        paddingTop: 2
    }

    return (
        <>
            {loginState == true ?
                <>
                <div style={{borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
                    <div style={{height: 45, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
                        <div className={'realtimeTitle'}>4차 산업혁명, 초연결성(Hyper-Connectivity), 지능정보화 등으로 다양하게 표현되는 최근 디지털
                            전환(Digital Transformation)의 추세
                        </div>
                        <div className={'memberState'}>
                            <div style={{float: 'right'}}>내정보</div>
                            <div style={{float: 'right', marginRight: 30, cursor:"pointer"}}onClick={logout}>로그아웃</div>
                        </div>
                    </div>
                    <div style={{height: 100}}>
                        <div style={{width: 380}}><img src={catbellImg} width={140} height={85}
                                                       style={{float: 'left', padding: 5}}/>
                            <div className={'headerFont'}>피드</div>
                            <div className={'headerFont'} style={{marginLeft: -20}}>전문검색</div>
                        </div>
                        <Input placeholder="통합 검색" prefix={<SearchOutlined/>} style={{
                            width: 'calc(100% - 380px - 400px)',
                            float: 'right',
                            height: 35,
                            marginTop: 35,
                            marginRight: 20,
                            borderRadius: 7
                        }}/>
                    </div>
                </div>
                {/*검색 선택 div*/}
                <div style={{width: 260, float: 'left'}}>
                    <div style={{
                        height: 100,
                        backgroundColor: '#f4f4f7',
                        borderBottom: '1px solid',
                        borderColor: '#dbdbdd',
                        padding: 10,

                    }}>
                        <span style={{fontSize: 18, fontWeight: 600}}>검색</span>

                        <Radio.Group onChange={checkId}  buttonStyle="solid" style={{marginTop: 12}}>
                            <Radio.Button style={useStyle} value="21">21대</Radio.Button>
                            <Radio.Button style={useStyle} value="20">20대</Radio.Button>
                            <Radio.Button style={useStyle} value="19">19대</Radio.Button>
                            <Radio.Button style={useStyle} value="18">18대</Radio.Button>
                        </Radio.Group>
                        {/*<div style={{marginTop: 20}}>*/}
                        {/*    <Button type={'primary'} style={useStyle} value={'21'} onClick={() => checkId('21')}>21대</Button>*/}
                        {/*    <Button type={'primary'} style={useStyle} value={'20'}>20대</Button>*/}
                        {/*    <Button type={'primary'} style={useStyle} value={'19'}>19대</Button>*/}
                        {/*    <Button type={'primary'} style={useStyle} value={'18'}>18대</Button>*/}
                        {/*</div>*/}
                    </div>


                    <div style={{
                        height: 'calc(100vh - 800px)',
                        backgroundColor: '#f4f4f7',
                        borderBottom: '1px solid',
                        borderColor: '#dbdbdd',
                        padding: 10
                    }}>
                        <div><span style={{fontSize: 18, fontWeight: 500}}>검색어</span></div>

                        <br/>
                        <Input onKeyPress={handleKeyPress} onChange={scriptWord}/>
                        <Button type={'primary'} style={{borderRadius: 7, width: '100%', marginTop: 10}}
                                onClick={searchKeyword}>검색</Button>
                    </div>

                </div>

                <div style={{height: 'calc(100vh - 275px)', width: 'calc(100% - 260px)', float: 'right', padding: 20}}>
                    <div style={{height: 70}}>
                        <div style={{
                            fontSize: 20,
                            fontWeight: 600,
                            width: 200,
                            paddingTop: 15,
                            float: "left",
                            color: '#3f3f3f'
                        }}>검색 결과: <span style={{color: '#1b3a6a'}}>{count}건</span></div>

                        <div style={{fontSize: 15, fontWeight: 300, width: 150, paddingTop: 20, float: "right"}}>
                            <span>10개</span> &nbsp; | &nbsp;<span>30개</span>&nbsp; | &nbsp;<span>50개</span></div>
                        <div style={{fontSize: 16, fontWeight: 350, width: 155, paddingTop: 19, float: "right"}}>
                            <span>최신순</span>  &nbsp; | &nbsp; <span>정확도순</span></div>
                    </div>
                    <div style={{
                        borderBottom: '2px solid',
                        borderColor: '#3f3f3f',
                        height: 30,
                        textAlign: "center",
                        fontSize: 14,
                        fontWeight: 600,
                        color: '#787878'
                    }}>
                        <div style={{float: "left", width: 360}}>법안정보</div>
                        <div style={{float: "left", width: 150}}>상태</div>
                        <div style={{float: "left", width: 130}}>키워드</div>
                        <div style={{float: "left", width: 130}}>관련 뉴스/관련법안</div>
                    </div>


                    {rawCentents.map((value, index) => {


                        return <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
                            {/*법안정보*/}
                            <div style={{float: "left", width: 360}}>
                                <div style={{height: 30, marginTop: 5}}><span style={{
                                    borderRadius: '20% 0% 0% 20%',
                                    border: '1px solid',
                                    background: "blue",
                                    borderColor: 'blue',
                                    color: "white",
                                    height: 40,
                                    padding: 2
                                }}>&nbsp; {value.raw_season}&nbsp;</span><span style={{
                                    border: '1px solid',
                                    borderRadius: '0% 8% 8% 0%',
                                    padding: 2
                                }}>&nbsp;{value.raw_num}&nbsp;</span>
                                    <span className={'rawKind'}
                                          style={{backgroundColor: value.raw_kind === '일부' ? 'blue' : '#d21d62'}}
                                    >{value.raw_kind}</span>
                                </div>
                                <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>
                                    {value.raw_title}
                                </div>
                                <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                                <div style={{height: 25}}><span>2021-03-11</span><span
                                    style={{float: 'right', marginRight: 15}}>{value.raw_group}</span></div>
                            </div>

                            {/*상태*/}
                            <div style={{float: "left", width: 150, height: 115}}>
                                <div style={{marginTop: 40, textAlign: "center"}}>
                                    <div>{value.status}</div>
                                    {/*<div>입법예고종료 <span>D-07</span></div>*/}
                                </div>
                            </div>

                            {/*키워드*/}
                            <div style={{float: "left", width: 130, height: 115}}>
                                <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                                    <span>#{value.keyword}</span>
                                </div>
                            </div>

                            {/*뉴스*/}
                            <div style={{float: "left", width: 130, height: 115}}>
                                <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                                    <span>AI추천 뉴스 1건</span>
                                </div>
                            </div>
                        </div>

                    })}
                </div>
                    </>

                :
                <Card title={'로그인'} style={{width: 500, margin:'0px auto', marginTop: 140}}>
                    <Form
                        name="normal_login"
                        className="login-form"
                        initialValues={{
                            remember: true,
                        }}
                        onFinish={onFinish}
                    >
                        <Form.Item
                            name="username"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please input your Username!',
                                },
                            ]}
                        >
                            <Input prefix={<UserOutlined className="site-form-item-icon"/>} placeholder="Username"/>
                        </Form.Item>
                        <Form.Item
                            name="password"
                            rules={[
                                {
                                    required: true,
                                    message: 'Please input your Password!',
                                },
                            ]}
                        >
                            <Input
                                prefix={<LockOutlined/>}
                                type="password"
                                placeholder="Password"
                            />
                        </Form.Item>

                        <Form.Item style={{textAlign: 'center'}}>
                            <Button type="primary" htmlType="submit" >
                                Log in
                            </Button>
                        </Form.Item>
                    </Form>
                </Card>
            }
        </>
    );
}

export default IndexPage;
