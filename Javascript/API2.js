

const req = new XMLHttpRequest()

req.onload = () => function(){ //its anonymous so doesn't need a name
console.log('It worked!', data);
createPage(data);
}

    // if(req.status === 200){
    //     console.log(req.responseText);
    // } else {
    //     console.log('handle error')
    // }


req.open('GET','https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json')
req.send();

function createPage(data){

    for(let i of data){
        console.log(i.data);
}

const parent = document.getElementById();

const wrapperEl = document.createElement

const hEl = document.createElement('h1'); 

const pEl = document.createElement('body');

hEl.append();
}