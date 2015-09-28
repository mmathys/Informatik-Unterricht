var gameList = [];

gameList.push({});

var spaceshipList = [];

spaceshipList.push({name:"Spaceship 1"})

spaceshipList[0].speed = 1000;

var crewList = [];

crewList.push({name:"Crew-Member 1", health: 30, spaceship: {name: "Spaceship 1"}});
crewList.push({name:"Crew-Member 2", health: 35, spaceship: {name: "Spaceship 1"}});
crewList.push({name:"Crew-Member 3", health: 35, spaceship: {name: "Spaceship 1"}});
crewList.push({name:"Commander", health: 35, isCommander: true, spaceship: {name: "Spaceship 1"}});

........

for(var i = 0; i<crewList.length; i++) {

  if(crewList[0].isCommander) {
    .....
  }

  crewList[0].health = crewList[0].health - damage;
}
