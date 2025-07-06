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