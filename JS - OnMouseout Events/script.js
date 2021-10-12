var object = {};
var event = document.getElementById("name");
var venue = document.getElementById("venue");
var date = document.getElementById("date");
var cost = document.getElementById("price");
var count = document.getElementById("count");
                
var totalCost = cost.value * count.value;
var dateToString = Date.parse(date);
                
var display = document.getElementById("display");

var obj = [];

function addEvent() {
    obj.push(event.value,venue.value,Date.parse(date), totalCost);
    console.log(object);
    return obj;
}
                
function display() {
    for(var i =0; i < obj.length; i++){
        console.log(obj[i]);
    }
    
}

function deleteElement(this.id){
    
}
            
