//값을 프린트 하기
console.log('hello there?');

//string
'hello';
"hello";
"i'm harry";

//nemeric
5;
5.12;

//boolean
true;
false;
true || false;
true && false;
!true;
console.log(!true);

//nothing
null;
undefined;

//array
[1,2,3];
['mon','tue','wed'];
['harry',49,239,true];

//create variable
const a=5;//변경할 수 없는 변수, 주로 사용
let b=true; //변경할 수 있는 변수, 변경 해얗는 경우 사용
var c=23; //const 가 없었을 때 사용ㅇ하던 변수 정의, 결국 let과 같음

//참고 변수이름 정하기 -> 개발자 사이에서 국룰
//whatIsMyNumber (camel : javascript 식 표현)
let whatIsMyNumber=[1,3,5,7,10];

//what_is_my_number (snake : python 식 표현)
let what_is_my_number = [1,2,3,4,5];

console.log(whatIsMyNumber);
whatIsMyNumber[4]=9;
console.log('changed:'+whatIsMyNumber[4]);
console.log(whatIsMyNumber);

