function toggleDropdown() {
  document.getElementById('dropdownContent').classList.toggle('show')
}

window.addEventListener('click', (event) => {
  if (!event.target.closest('.dropdown-button'))
    document
      .querySelectorAll('.dropdown-content.show')
      .forEach((dropdown) => {
        dropdown.classList
          .remove('show')
    })
})
