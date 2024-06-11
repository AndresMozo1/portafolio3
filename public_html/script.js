document.addEventListener('DOMContentLoaded', function () {
    // Efecto de desplazamiento suave para los enlaces internos
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();

            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });

    // Efecto de resaltado en el menú al desplazarse
    window.addEventListener('scroll', function () {
        const scrollPosition = window.scrollY;
        const sections = document.querySelectorAll('.scroll-section');

        sections.forEach(section => {
            const sectionTop = section.offsetTop;
            const sectionHeight = section.clientHeight;

            if (scrollPosition >= sectionTop - sectionHeight / 3 && scrollPosition < sectionTop + sectionHeight - sectionHeight / 3) {
                // Añadir clase de resaltado al enlace del menú correspondiente a la sección actual
                const link = document.querySelector(`nav a[href="#${section.id}"]`);
                link.classList.add('active');
            } else {
                // Quitar clase de resaltado de otros enlaces del menú
                const link = document.querySelector(`nav a[href="#${section.id}"]`);
                link.classList.remove('active');
            }
        });
    });

    // Efectos al pasar el ratón sobre las tarjetas
    document.querySelectorAll('.card').forEach(card => {
        card.addEventListener('mouseover', function () {
            // Aumentar tamaño al pasar el mouse
            this.style.transform = 'scale(1.05)';
            // Sombra más pronunciada
            this.style.boxShadow = '0 8px 16px rgba(0, 0, 0, 0.3)';
        });

        card.addEventListener('mouseout', function () {
            // Revertir los cambios al salir del mouse
            this.style.transform = 'scale(1)';
            this.style.boxShadow = '0 4px 6px rgba(0, 0, 0, 0.1)';
        });
    });

    // Mejorar el formulario de contacto
    const contactForm = document.getElementById('contact-form');
    const confirmationMessage = document.getElementById('confirmation-message');

    contactForm.addEventListener('submit', function (event) {
        event.preventDefault();

        // Simular un proceso de envío con una animación
        confirmationMessage.innerHTML = '<div class="loading">Sending...</div>';

        // Simular un retraso antes de mostrar el mensaje de confirmación
        setTimeout(function () {
            // Puedes agregar aquí la lógica para enviar el formulario por AJAX si lo prefieres.

            // Mostrar mensaje de confirmación con animación
            confirmationMessage.innerHTML = '<div class="success">¡Thank you for your message!</div>';

            // Restablecer el formulario después de 3 segundos
            setTimeout(function () {
                contactForm.reset();
                confirmationMessage.innerHTML = ''; // Limpiar el mensaje después de restablecer el formulario
            }, 3000);
        }, 1500);
    });
});
