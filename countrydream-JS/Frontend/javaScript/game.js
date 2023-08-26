const start = document.querySelector("#start")
const restart = document.querySelector("#restart")
const contentList = document.querySelector(".list");
let arrayBack2 =["/Resources/Back1.jpg","/Resources/Back2.jpg","/Resources/Back3.jpg","/Resources/Back4.jpg"]
const audio = new Audio("/Resources/[Ghost] Riders In the Sky (Digitally Remastered, 1996).mp3")
var flag = false;
let index1 = 0;
let choice = "";
let userName = "";
let counterWrong = 0;
let counterRights = 0;
let maxAttempts = 3;
let counter = 1;
let totalValues = 0;


function startGame() {
   
    audio.play();
    const menu = document.querySelector(".menu");
    menu.style.display = "none";
    const game = document.querySelector(".game");
    game.style.display = "flex"

    fetchQuestions();
}
async function fetchQuestions() {
    if(counter > 8){
        return;
    }
    try {
        const response = await fetch(`http://192.168.2.21:8080/countrydream/api/question/${counter}`);
        const data = await response.json();
       
        populateAnswers(data.answers);
        populateQuestion(data.question);
    } catch (error) {
        console.log(error);
    }
}
function populateQuestion(question) {
    const questionElement = document.querySelector(".header-questions");
    questionElement.textContent = question;
}
function populateAnswers(answers) {
    
    contentList.innerHTML = "";
   
    answers.forEach(answerObject => {
        const li = document.createElement("li");
        const span = document.createElement("span");
        span.textContent = answerObject.answer;
        li.appendChild(span);
        contentList.appendChild(li);
        li.addEventListener("click", (e) => {
            const answerAudio = new Audio("/Resources/cowboy-curtis.mp3")
            answerAudio.play();
            //setTimeout(answerAudio.play(),500)
            counter++;
            answerValue = answerObject.value;
            totalValues += answerValue;
            console.log("answer value: " + answerValue);
            console.log("total value: " + totalValues);
            fetchQuestions();
            if (counter > 8) {
                document.querySelector(".game").style.display = "none";
                document.querySelector(".content-solution").style.display = "flex";
                fetchSolution();
                return;
            }
           
        });
    })
    async function fetchSolution() {
        audio.pause();
        try {
            const response = await fetch(`http://192.168.2.21:8080/countrydream/api/result/${totalValues}`);
            const data = await response.json(); // need to change?
            populateSolution(data);
        } catch (error) {
            console.log(error);
        }
    }
    function populateSolution(result) {
        const titleElement = document.querySelector(".title");
        titleElement.textContent = result.title;
        const solutionElement = document.querySelector(".solution");
        console.log(result);
        solutionElement.textContent =`${input.value}, ${result.text}`;
        
        const imageElement = document.createElement("img");
        
        imageElement.src = result.image // Replace with the actual property name
        imageElement.alt = "Solution Image"; // Set an appropriate alt text
        const imageContainer = document.querySelector(".image-container");
        imageContainer.innerHTML = ""
        imageContainer.appendChild(imageElement);
        solutionElement.style.display = "flex";
    }
}

restart.addEventListener("click", function () {
   
    audio.play();
    const menu = document.querySelector(".menu");
    menu.style.display = "none";
    document.querySelector(".content-solution").style.display = "none";

    counter = 1;
    totalValues = 0;
    const game = document.querySelector(".game");
    game.style.display = "flex"

    fetchQuestions();
})
setInterval(function(){
    document.querySelector(".container").style.background = `url(${arrayBack2[index1]})`;
    document.querySelector(".container").style.backgroundSize = "cover"
      
    index1++;
    if(index1 === 3){
        index1 = 0;
    }
},4000)

