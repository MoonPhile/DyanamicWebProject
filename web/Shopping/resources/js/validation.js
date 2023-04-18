function CheckAddProduct(){
    var productId = document.getElementById("productId");
    var name = document.getElementById("name");
    var unitPrice = document.getElementById("unitPrice");
    var unitsInStock = document.getElementById("unitsInStock");

    //상품 아이디 체크
    if(!check(/^P[0-9]{4,11}$/, productId,"[상품 코드]\nP와 숫자를 조합하여 5~12자까지 입력하세요\n첫 글자는 반드시 P로 시작하세요"));
}