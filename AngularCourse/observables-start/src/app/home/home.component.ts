import { Component, OnInit, OnDestroy } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import 'rxjs/Rx';
import { Observer, Subscription } from 'rxjs/Rx';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  numberSubsObs: Subscription;
  customSubsObs: Subscription;

  constructor() { }

  ngOnInit() {
    const myNumbers = Observable.interval(1000).map( (data: number) => {
      return data * 2;
    });
    this.numberSubsObs = myNumbers.subscribe((num: number) => {console.log(num);});

    const myObservable = Observable.create((observer: Observer<string>) => {
      setTimeout(() => {
        observer.next('first package');
      }, 2000);
      setTimeout(() => {
        observer.next('second package');
      }, 4000);
      setTimeout(() => {
        //observer.error('this does not work');
        observer.complete();
      }, 5000);
      setTimeout(() => {
        observer.next('third package');
      }, 6000);
    })
    this.customSubsObs = myObservable.subscribe((data: string) => {
      console.log(data);
    },(error: string) => {
      console.log(error);
    },() => {
      console.log('Completed');
    })
  }

  ngOnDestroy(){
    this.numberSubsObs.unsubscribe();
    this.customSubsObs.unsubscribe();
  }
}
