import '../resources/css/index.css'
import 'antd/dist/antd.css';
import {Button, Input} from "antd";

function IndexPage() {
    return (
        <>
            <div style={{height: 'calc(100vh - 275px)', width: 260, float: 'left'}}>
                <div style={{
                    height: 180,
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd'
                }}>
                    <span>검색</span>
                    <br/>
                    <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                    <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                    <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                    <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                </div>
                <div style={{
                    backgroundColor: '#f4f4f7',
                    borderBottom: '1px solid',
                    borderColor: '#dbdbdd',
                    height: 'calc(100vh - 420px)'
                }}>
                    <div>

                        <div style={{
                            height: 180,
                            backgroundColor: '#f4f4f7',
                            borderBottom: '1px solid',
                            borderColor: '#dbdbdd'
                        }}>
                            <span>검색</span>
                            <br/>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                        </div>


                        <div style={{
                            height: 180,
                            backgroundColor: '#f4f4f7',
                            borderBottom: '1px solid',
                            borderColor: '#dbdbdd'
                        }}>
                            <span>검색</span>
                            <br/>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                        </div>
                        <div style={{
                            height: 180,
                            backgroundColor: '#f4f4f7',
                            borderBottom: '1px solid',
                            borderColor: '#dbdbdd'
                        }}>
                            <span>검색</span>
                            <br/>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                        </div>
                        <div style={{
                            height: 180,
                            backgroundColor: '#f4f4f7',
                            borderBottom: '1px solid',
                            borderColor: '#dbdbdd'
                        }}>
                            <span>검색</span>
                            <br/>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                            <Button type={'primary'} style={{borderRadius: 17}}>입법예고만</Button>
                        </div>
                    </div>

                    <div style={{height: 180, backgroundColor: '#f4f4f7'}}>
                        <div>검색어 <Button>제외 검색</Button></div>
                        <br/>
                        <Input/>
                        <Button type={'primary'} style={{borderRadius: 17}}>검색</Button>
                        <Button type={'primary'} style={{borderRadius: 17}}>구독신청</Button>

                    </div>
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
                
            </div>
            <div style={{
                borderBottom: '1px solid',
                borderColor: '#e5e5e5',
                height: 130,
                backgroundColor: "blue",
                width: '100%',
                float: 'left'
            }}>

            </div>
        </>
    );
}

export default IndexPage;
