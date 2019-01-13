import { Component, OnInit } from '@angular/core';
import { Ingredient } from '../shared/ingredient.model';

@Component({
  selector: 'app-shoppinglist',
  templateUrl: './shoppinglist.component.html',
  styleUrls: ['./shoppinglist.component.scss']
})
export class ShoppinglistComponent implements OnInit {
  ingredients : Ingredient[] = [new Ingredient("apple", 10),
                                new Ingredient("tomoto",20)];
  constructor() { }

  ngOnInit() {
  }

}
