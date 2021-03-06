import { NgModule } from "@angular/core";
import { RecipesComponent } from "./recipes.component";
import { RecipesStartComponent } from "./recipes-start/recipes-start.component";
import { RecipeListComponent } from "./recipe-list/recipe-list.component";
import { RecipesEditComponent } from "./recipes-edit/recipes-edit.component";
import { RecipeDetailComponent } from "./recipe-detail/recipe-detail.component";
import { RecipeItemComponent } from "./recipe-list/recipe-item/recipe-item.component";
import { DropdownDirective } from "../shared/dropdown.directive";
import { ReactiveFormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
import { RecipesRoutingModule } from "./recipes-routing.module";

@NgModule({
    declarations: [
        RecipesComponent,
        RecipesStartComponent,
        RecipeListComponent,
        RecipesEditComponent,
        RecipeDetailComponent,
        RecipeItemComponent,
        DropdownDirective
    ],
    imports: [
        CommonModule,
        ReactiveFormsModule,
        RecipesRoutingModule
    ]
})
export class RecipeModule {
    
}