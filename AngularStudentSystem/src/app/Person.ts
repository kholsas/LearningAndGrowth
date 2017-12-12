export class Person {

  private _firstName: String = '';
  private _lastName: String = '';
  private _emailAddress: String = '';
  private _studentNumber: String = '';
  private _facultyName: String = '';
  private _degreeName: String = '';


  constructor() {
  }


  get firstName(): String {
    return this._firstName;
  }

  set firstName(value: String) {
    this._firstName = value;
  }

  get lastName(): String {
    return this._lastName;
  }

  set lastName(value: String) {
    this._lastName = value;
  }

  get emailAddress(): String {
    return this._emailAddress;
  }

  set emailAddress(value: String) {
    this._emailAddress = value;
  }

  get studentNumber(): String {
    return this._studentNumber;
  }

  set studentNumber(value: String) {
    this._studentNumber = value;
  }

  get facultyName(): String {
    return this._facultyName;
  }

  set facultyName(value: String) {
    this._facultyName = value;
  }

  get degreeName(): String {
    return this._degreeName;
  }

  set degreeName(value: String) {
    this._degreeName = value;
  }
}
