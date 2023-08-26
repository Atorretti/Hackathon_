const btn = document.querySelector("#start");
const img = document.querySelector(".menu");
let input = document.querySelector("#name")

let arrayBack =["../Resources/Back1.jpg",
"../Resources/Back2.jpg",
"../Resources/Back3.jpg",
"../Resources/Back4.jpg"]
let index = 0;

window.onload = () =>{
   
   
}  


btn.addEventListener("click",function(){
   

    console.log(input.value)
    if(!input.value){
        window.alert("please, insert your name");
        
    }else{
        document.querySelector(".container").style.display = "flex"
        img.style.background = `url(${arrayBack[index]})`;
        img.style.backgroundSize = "cover"
        startGame()
    
    }
  
})

setInterval(function(){
    img.style.background = `url(${arrayBack[index]})`;
    img.style.backgroundSize = "cover"  
    index++;
    if(index === 3){
        index = 0;
    }
},4000)



