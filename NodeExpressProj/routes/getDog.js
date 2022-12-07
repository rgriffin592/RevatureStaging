const { json } = require("express");
var express = require("express");
var router = express.Router();

var dogList=[
    {id:1, name: "koda", breed: "bernese mt. dog", color: "black", age: 6, sex: "f"},
    {id:2, name: "winnie", breed: "great pyrenees", color: "beige", age: 1, sex: "f"},,
    {id:3, name: "wiley", breed: "french bulldog", color: "tan", age: 8, sex: "f"}
]

router.get("/",function(req,res,next){
    res.json(dogList)
});

router.get("/:id",(req,res,next) => {
    let id=parseInt(req.params.id);
    let getDog=zoidList.find((dog) => {
        return zoid.id = id;
    })
    res.json(getDog);
})

router.post("/",function(req,res,next){
     console.log(`the request body for a post is ${JSON.stringify(req.body)}`)
    let newDog = {name: "", breed: ""};
   
    newDog.name = req.body.name;
    newDog.breed = req.body.breed;
    newDog.id = parseInt(req.body.id);
    newDog.color = req.body.color;
    newDog.age = parseInt(req.body.atk);
    newDog.sex = req.body.sex;
    zoidList.push(newDog);
    res.send("added new dog");
})

router.delete("/:id", function(req,res,next){
    let id = parseInt(req.params.id);
    let index = dogList.findIndex((dog)=> {
        return dog.id == id
    })
    res.send("deleted " + JSON.stringify(dogList.splice(index,1)));

})

router.patch("/:id", function(req,res,next) {
    let id = parseInt(req.params.id);

   let index = dogList.findIndex((dog) => {
    return dog.id == id
   })

    
    dogList[index].name = req.body.name;
    dogList[index].breed = req.body.breed;
    dogList[index].color = req.body.color;
    dogList[index].age = parseInt(req.body.age);
    dogList[index].sex = req.body.sex;
    
    res.send("updated "+JSON.stringify(dogList[index]));
})

module.exports=router;