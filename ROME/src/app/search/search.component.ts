import { Component, OnInit } from '@angular/core';
import { Article } from '../models/article';
import { ArticleService } from '../service/article.service';
import { SharedService } from '../service/sharedservice';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})


export class SearchComponent implements OnInit {
  articles: Article[] | undefined

  constructor( private articlService: ArticleService, private sharedService: SharedService) { }

  ngOnInit() {
    this.sharedService.getSearchData().subscribe( data => {
      console.log("my search Results ",  data)
      this.articles = data
    })
  }

}
