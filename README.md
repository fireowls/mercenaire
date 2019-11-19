# mercenaire

## project list:
* ```core``` contain the logic code for the game application
* ```desktop``` use the *core* project and adapt him for a Desktop
* ```mercenaire``` this is the gam-api all structure of the game is inside
* ```server``` the server code for the game

## Rules

### Structures rules

---
#### World
A world is a file:
```
world_file                  <- the world firectory 
    ├── chunks              <- this directory contain all chunks of the world
    │    └── chunk_0-0.json <- a chunk file 0-0 represent his location
    │    └── ...
    └── world-info.json     <- some information about the world
```

#### world-info.json
##### Exemple:
```json
{
  "name": "my-world"
}
```
##### Utilisation:
| attribute | type | mandatory | description |
|:-:|:-:|:-:|:-:|
| name | string | true | describe the name of the server |
---
#### chunk_?_?.json
A chunk have a position in a map and some tiles.
##### Exemple:
```json
{
  "position": "0:0",
  "tiles": [
    {
      "type": "GRASS",
      "status": {
        
      }
    }
  ]
}
```
##### Utilisation:
| attribute | type | mandatory | description |
|:-:|:-:|:-:|:-:|
| name | string | true | describe the name of the server |