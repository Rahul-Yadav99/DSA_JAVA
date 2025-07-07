function persion(name, age) {
    this.name = name
    this.age = age
}
const userData = new persion("Rahul", 23)
if (typeof userData.age == "number") {
    console.log(typeof userData?.name, typeof userData?.age)
} else {
    console.log("age is not a number")
}

var a = 1
var b = 12
if (a == 1 || b == 1) {
    console.log("a and b are equal")
} else {
    console.log("a and b are not equal")
}