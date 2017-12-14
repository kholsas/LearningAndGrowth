export class Post {

  private _userId: number;
  private _title: String;
  private _body: String;


  get userId(): number {
    return this._userId;
  }

  set userId(value: number) {
    this._userId = value;
  }

  get title(): String {
    return this._title;
  }

  set title(value: String) {
    this._title = value;
  }

  get body(): String {
    return this._body;
  }

  set body(value: String) {
    this._body = value;
  }
}
