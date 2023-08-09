var toyRobot = {
    productId : "123-45",
    name: "로봇",
    price: "25,000",
    madeIn: "Korea",
    quantity: 10,
    showStock: function(){
        document.querySelector("#display").innerHTML = this.name + " 제품은 " + this.quantity + "개 남아있습니다.";
    }
};

toyRobot.showStock();


