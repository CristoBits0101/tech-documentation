function toggleDropdown() {
  document.getElementById('dropdownContent').classList.toggle('show')
}

window.addEventListener('click', (event) => {
  if (!event.target.matches('.dropdown-button')) {
    const dropdowns = document.getElementsByClassName('dropdown-content')
    for (let i = 0; i < dropdowns.length; i++) {
      const openDropdown = dropdowns[i]
      if (openDropdown.classList.contains('show'))
        openDropdown.classList.remove('show')
    }
  }
})
