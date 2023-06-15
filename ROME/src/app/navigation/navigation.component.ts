import { Component, OnInit } from '@angular/core';
import { FormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Router } from '@angular/router';
import { SharedService } from '../service/sharedservice';



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




  constructor(private articleService: ArticleService,  private router: Router, private sharedserivce: SharedService) {FormsModule }
  // anything placed here will take affect the moment the application runs
  ngOnInit() {
  }

  getSearch =() => {
    return this.searchForm.get("searchBox")
  }



  // search topic will come from html
  onSubmit = () => {
    let articles = this.articleService.search(this.searchForm.value["searchBox"]).subscribe(data=> {
    this.sharedserivce.setSearchData(data)

   },

// error handling might be necessary but does not seem to be needed at the moment
   error =>{

   }
   )
    console.log(articles)
   this.router.navigateByUrl("/search")
    // return articles
 }

}




