import '../resources/css/index.css'
import 'antd/dist/antd.css';
import {Button, Input} from "antd";

function IndexPage() {
    return (
        <>
            <div style={{ width: 260, float: 'left'}}>
                <div style={{
                    height: 155,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding:10
                }}>
                    <span style={{fontSize: 18, fontWeight:600}}>검색</span>
                    <div style={{marginTop: 20}}>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3}}>입법예고만</Button>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3}}>대안입법만</Button>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>21대</Button>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>20대</Button>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>19대</Button>
                    <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>18대</Button>
                    </div>
                </div>


                <div style={{
                    height: 155,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding:10
                }}>
                    <span style={{fontSize: 18, fontWeight:600}}>입법종류</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>전체</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>일부</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>전부</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>폐지</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>제정</Button>
                    </div>
                </div>



                <div style={{
                    height: 190,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding:10
                }}>
                    <span style={{fontSize: 18, fontWeight:600}}>계류의안</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>전체</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>접수</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>소관위접수</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>소관위심사</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>체계자구심사</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>본회의부의</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>본회의불부의</Button>
                    </div>
                </div>


                <div style={{
                    height: 160,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding:10
                }}>
                    <span style={{fontSize: 18, fontWeight:500}}>처리의안</span>
                    <div style={{marginTop: 20}}>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>전체</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>원안가결</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>수정가결</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>대안반영</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>철회</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>부결</Button>
                        <Button type={'primary'} style={{borderRadius: 17, margin:3, padding:5, paddingLeft:10, paddingRight: 10}}>폐기</Button>
                    </div>
                </div>


                <div style={{
                    height: 'calc(100vh - 800px)',
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    padding:10
                }}>
                    <div><span style={{fontSize: 18, fontWeight:500}}>검색어</span><Button style={{float:'right', borderRadius:15, backgroundColor:'#f4f4f7'}}>제외 검색어</Button></div>

                        <br/>
                        <Input/>
                        <Button type={'primary'} style={{borderRadius: 7, width:'100%',marginTop: 10}}>검색</Button>
                        <Button type={'primary'} style={{borderRadius: 7, width:'100%',marginTop: 7}}>구독신청</Button>
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
                    }}>검색 결과: <span style={{color: '#1b3a6a'}}>32,661</span></div>

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
                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>
                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>

                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>
                <div style={{height: 125, borderBottom: '1px solid', borderColor: '#e5e5e5'}}>
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
                        }}>&nbsp;2&nbsp;1&nbsp;</span><span style={{
                            border: '1px solid',
                            borderRadius: '0% 8% 8% 0%',
                            padding: 2
                        }}>0&nbsp;8&nbsp;7&nbsp;7&nbsp;2</span>
                            <span style={{
                                marginLeft: 5,
                                borderRadius: 10,
                                height: 30,
                                border: '1px solid',
                                padding: 2,
                                paddingLeft: 5,
                                paddingRight: 5,
                                color: "white",
                                backgroundColor: "blue"
                            }}>일부</span>
                        </div>
                        <div style={{height: 35, fontSize: 18, fontWeight: 500, paddingTop: 2}}>가정폭력방지 및 피해자보호 등에 관한
                            법률
                        </div>
                        <div style={{height: 25, paddingTop: 8}}>황운하의원 등 11인</div>
                        <div style={{height: 25}}><span>2021-03-11</span><span
                            style={{float: 'right', marginRight: 15}}>여성가족위원회</span></div>
                    </div>

                    {/*상태*/}
                    <div style={{float: "left", width: 150, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center"}}>
                            <div>소관위 접수</div>
                            <div>입법예고종료 <span>D-07</span></div>
                        </div>
                    </div>

                    {/*키워드*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 40, textAlign: "center", fontSize: 15}}>
                            <span>#공청회</span>
                            <span>#처분</span>
                            <span>#국민</span>
                            <span>#개최</span>
                            <span>#행정청</span>
                        </div>
                    </div>

                    {/*뉴스*/}
                    <div style={{float: "left", width: 130, height: 115}}>
                        <div style={{marginTop: 50, textAlign: "center", fontSize: 15, fontWeight: 500}}>
                            <span>AI추천 뉴스 1건</span>
                        </div>
                    </div>
                </div>
            </div>

        </>
    );
}

export default IndexPage;
