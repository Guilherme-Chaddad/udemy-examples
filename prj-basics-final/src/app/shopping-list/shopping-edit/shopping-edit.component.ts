import { Component, OnInit, ViewChild, ElementRef, Output, EventEmitter } from '@angular/core';
import { Ingredient } from '../../shared/ingredient.model';
import { ShoppingListService } from '../shopping-list.service';

@Component({
  selector: 'app-shopping-edit',
  templateUrl: './shopping-edit.component.html',
  styleUrls: ['./shopping-edit.component.css']
})
export class ShoppingEditComponent implements OnInit {
  @ViewChild('nameInput') inputNameRef: ElementRef;
  @ViewChild('amountInput') inputAmountRef: ElementRef;
  //@Output() ingredientAdded = new EventEmitter<Ingredient>();
  constructor(private slService: ShoppingListService) { }

  ngOnInit() {
  } 

  onAddItem(){
    const ingredient = new Ingredient(this.inputNameRef.nativeElement.value, this.inputAmountRef.nativeElement.value);
    //this.ingredientAdded.emit(ingredient);
    this.slService.addIngredient(ingredient);
  }
}
