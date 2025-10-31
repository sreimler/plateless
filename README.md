# Plateless 🍽️

A Kotlin Multiplatform Mobile app to calculate food portion sizes by weighing food in containers of known tare weight.

## Project Structure

Monorepo containing:
- `apps/` – Kotlin Multiplatform Compose applications (Android & iOS)
- `backend/` – Planned Ktor backend service (coming later)

## Current State ✅

**Domain Layer** – Pure business logic with comprehensive unit tests for weight calculations and domain-driven error handling.

**Presentation Layer** – ViewModel with UDF pattern, immutable state management via `StateFlow`, and structured error mapping using sealed classes.

**Architecture** – Separation of concerns following Android best practices: exhaustive error handling, UiText pattern for localization-ready strings and preparation for (offline-first) repository implementation and dependency injection.

## Next Steps 🎯

- UI layer: build the MVP of a Compose Multiplatform UI for plateless
- Data layer: implement database and offline-first repository 
- Dependency injection: add and wire up
- Backend: implement and integrate