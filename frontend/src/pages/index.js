import React, {useEffect, useState} from 'react';
import {Button, Input} from "antd";
import {bsApi} from "../utills/rawApi";
import '../resources/css/index.css';

function IndexPage() {
    const [rawCentents, setRawCentents] = useState([]);
    const [count, setCount] = useState(0);

    useEffect(() => {
        getRawContents()
        getRawCount()
    }, [])

    // rawListCount
    const getRawContents = async () => {

        const resultData = await bsApi.get('/rawList');
        setRawCentents(resultData.data)
    }

    const getRawCount = async () => {

        const resultData = await bsApi.get('/rawListCount');
        setCount(resultData.data)
    }

    const handleKeyPress = e => {
        console.log(e.key);
        if (e.key === 'Enter') {
           alert('check')
        }
    };

    const useStyle = {
        borderRadius: 17,
        margin: 3,
        padding: 5,
        paddingLeft: 10,
        paddingRight: 10
    }

    return (
        <>
            {/*검색 선택 div*/}
            <div style={{width: 260, float: 'left'}}>
                <div style={{
                    height: 155,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding: 10
                }}>
                    <span style={{fontSize: 18, fontWeight: 600}}>검색</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={{borderRadius: 17, margin: 3}}>입법예고만</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin: 3}}>대안입법만</Button>
                        <Button type={'primary'} style={useStyle}>21대</Button>
                        <Button type={'primary'}style={useStyle}>20대</Button>
                        <Button type={'primary'}style={useStyle}>19대</Button>
                        <Button type={'primary'} style={useStyle}>18대</Button>
                    </div>
                </div>

                {/*입법종류 선택 div*/}
                <div style={{
                    height: 155,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding: 10
                }}>
                    <span style={{fontSize: 18, fontWeight: 600}}>입법종류</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={useStyle}>전체</Button>
                        <Button type={'primary'}style={useStyle}>일부</Button>
                        <Button type={'primary'} style={useStyle}>전부</Button>
                        <Button type={'primary'} style={useStyle}>폐지</Button>
                        <Button type={'primary'} style={useStyle}>제정</Button>
                    </div>
                </div>

                {/*계류의 선택 div*/}
                <div style={{
                    height: 190,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding: 10
                }}>
                    <span style={{fontSize: 18, fontWeight: 600}}>계류의안</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={useStyle}>전체</Button>
                        <Button type={'primary'} style={useStyle}>접수</Button>
                        <Button type={'primary'} style={useStyle}>소관위접수</Button>
                        <Button type={'primary'} style={useStyle}>소관위심사</Button>
                        <Button type={'primary'} style={useStyle}>체계자구심사</Button>
                        <Button type={'primary'} style={useStyle}>본회의부의</Button>
                        <Button type={'primary'} style={useStyle}>본회의불부의</Button>
                    </div>
                </div>


                {/*처리의안 선택 div*/}
                <div style={{
                    height: 160,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding: 10
                }}>
                    <span style={{fontSize: 18, fontWeight: 500}}>처리의안</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={useStyle}>전체</Button>
                        <Button type={'primary'} style={useStyle}>원안가결</Button>
                        <Button type={'primary'} style={useStyle}>수정가결</Button>
                        <Button type={'primary'} style={useStyle}>대안반영</Button>
                        <Button type={'primary'}style={useStyle}>철회</Button>
                        <Button type={'primary'}style={useStyle}>부결</Button>
                        <Button type={'primary'} style={useStyle}>폐기</Button>
                    </div>
                </div>


                <div style={{
                    height: 'calc(100vh - 800px)',
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding: 10
                }}>
                    <div><span style={{fontSize: 18, fontWeight: 500}}>검색어</span><Button
                        style={{float: 'right', borderRadius: 15, backgroundColor: '#f4f4f7'}}>제외 검색어</Button></div>

                    <br/>
                    <Input onKeyPress={handleKeyPress} />
                    <Button type={'primary'} style={{borderRadius: 7, width: '100%', marginTop: 10}}>검색</Button>
                    <Button type={'primary'} style={{borderRadius: 7, width: '100%', marginTop: 7}}>구독신청</Button>
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
                    console.log(value, '!!!!!')


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
    );
}

export default IndexPage;
