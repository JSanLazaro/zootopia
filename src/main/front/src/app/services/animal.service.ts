import { Injectable } from '@angular/core';
import { Animal } from '../models/Animal.model';
import { animals } from '../mockup-animals';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {
  animalList:Animal[] = animals;

  constructor() { }
  getAnimals():Animal[]{
    return [
      {
          id:1,
          name: "Paquito",
          type:"un tipo",
          family:"felino",
          gender:"male",
          date: new Date(),
          img_url:"assets/img/animals/lobo.jpg",
          origin:"Africa"
      },
      {
          id:2,
          name: "Pepito",
          type:"un tipo",
          family:"felino",
          gender:"shemale",
          date: new Date(),
          img_url:"assets/img/animals/lobo.jpg",
          origin:"America del Norte"
      }
  ];
  }
}
