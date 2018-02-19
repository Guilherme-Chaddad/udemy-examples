import { Component, OnInit, Input, OnChanges, SimpleChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css']
})
export class ServerElementComponent implements OnInit, OnChanges, DoCheck,
 AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  @Input('srvElement') element: {type: string, name: string, content: string};
  constructor() {
    console.log('Constructor called');
   }

  ngOnInit() {
    console.log('ngOnInit Called! (Once, right after constructor)');
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log('ngOnChanges Called! (Everytime after a component change)');
    console.log(changes);
  }
  ngDoCheck(){
    console.log('ngDoCheck Called! (Everytime angular checks for a change)');
  }
  ngAfterContentInit(){
    console.log('ngAfterContentInit Called!');
  }
  ngAfterContentChecked(){
    console.log('ngAfterContentChecked Called!');
  }
  ngAfterViewInit(){
    console.log('ngAfterViewInit Called!');
  }
  ngAfterViewChecked(){
    console.log('ngAfterViewChecked Called!');
  }
  ngOnDestroy(){
    console.log('ngOnDestroy Called!');
  }
}
