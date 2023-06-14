import { Component, OnInit } from '@angular/core';
import { FormsModule, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
// import { NgModule } from '@angular/forms';
import {NgForm} from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
// import { error } from 'console';



@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss']
})
export class NavigationComponent implements OnInit {


  articles: Article[] | undefined

  searchForm: FormGroup = new FormGroup({
    searchBox:new FormControl("", [
      Validators.required
    ])
  })


  constructor(private articleService: ArticleService,  private formBuilder: FormBuilder, http: HttpClient) {FormsModule }
// seen an example where this is supposed to be async and i do a try catch when calling onsubmit for error handling.
   ngOnInit() {
    // try {
         this.onSubmit();
        // this.article = this.articles;
    // } catch{

    // }

  }

  getSearch =() => {
    return this.searchForm.get("searchBox")
  }



  // search topic will come from html
  onSubmit = () => {
    console.log("its been called")
    console.log(this.searchForm.value)
    let articles = this.articleService.search(this.searchForm.value["searchBox"]).subscribe(data=> {
    console.log(this.articles = data)
   },

   //attempting error handling of request not sure if i should do it here or maybe in ngOnInit
   error =>{

   }
   )
    console.log(articles)
    // return result
 }

}




