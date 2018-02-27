import { Component, OnInit, Input, OnChanges, SimpleChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy, ViewChild, ElementRef, ContentChild } from '@angular/core';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css']
})
export class ServerElementComponent implements OnInit, OnChanges, DoCheck,
 AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

  @Input('srvElement') element: {type: string, name: string, content: string};
  @ViewChild('heading') header: ElementRef;
  @ContentChild('contentParagraph') paragraph: ElementRef;
  constructor() {
    console.log('Constructor called');
   }

  ngOnInit() {
    console.log('ngOnInit Called! (Once, right after constructor)');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }

  ngOnChanges(changes: SimpleChanges) {
    console.log('ngOnChanges Called! (Everytime after a component change)');
    console.log(changes);
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
  ngDoCheck(){
    console.log('ngDoCheck Called! (Everytime angular checks for a change)');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
  ngAfterContentInit(){
    console.log('ngAfterContentInit Called!');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content:  (has value only after Content Init is called)'+this.paragraph.nativeElement.textContent);
  }
  ngAfterContentChecked(){
    console.log('ngAfterContentChecked Called!');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
  ngAfterViewInit(){
    console.log('ngAfterViewInit Called!');
    console.log('Header content (has value only after view Init is called): '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
  ngAfterViewChecked(){
    console.log('ngAfterViewChecked Called!');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
  ngOnDestroy(){
    console.log('ngOnDestroy Called!');
    console.log('Header content: '+this.header.nativeElement.textContent);
    console.log('Paragraph content: '+this.paragraph.nativeElement.textContent);
  }
}
