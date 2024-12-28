// Create
document.cookie = 'cookieName=cookieCristo'
console.log(document.cookie)

// Time
document.cookie = 'expirationName=Name; expires=' + new Date(2023, 1, 9).toISOString()

// Read
console.log(document.cookie)
