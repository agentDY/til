function showPrice(){
    let originPrice = document.querySelector("#oPrice").value; 
    let rate = document.querySelector("#rate").value;
    let savedPrice = originPrice * (rate / 100);    // 10000, 0.25 = 2500
    let resultPrice = originPrice - savedPrice;     // 최종결과값, 1000 - 2500 = 7500
    document.querySelector("#showResult").innerHTML = `상품의 원래 가격은 ${originPrice}원이고, 할인율은 ${rate}%입니다. 
                                        ${savedPrice}원을 절약한 ${resultPrice}원에 구입할 수 있습니다.`;
}


