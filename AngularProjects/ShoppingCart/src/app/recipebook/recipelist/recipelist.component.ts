import { Component, OnInit } from '@angular/core';
import { Recipe } from './recipe.model';

@Component({
  selector: 'app-recipelist',
  templateUrl: './recipelist.component.html',
  styleUrls: ['./recipelist.component.scss']
})
export class RecipelistComponent implements OnInit {
  recipes: Recipe[] = [new Recipe('A Test REcipe', 'this is a simple recipe', 'https://cdn.pixabay.com/photo/2015/10/26/07/21/soup-1006694_1280.jpg'),
                      new Recipe('A Test REcipe', 'this is a simple recipe', 'https://cdn.pixabay.com/photo/2015/10/26/07/21/soup-1006694_1280.jpg')]
  constructor() { }

  ngOnInit() {
  }
}
