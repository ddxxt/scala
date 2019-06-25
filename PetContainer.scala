package lab10

class PetContainer [P <: Pet](p: P) {
  def pet: P = p
}
